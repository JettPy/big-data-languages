package lab4.var1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private final String name;
    private final ArrayList<Road> roads;

    public class Road {
        private final String name;
        private final String type;
        private final ArrayList<Pair<Road, Integer>> roads;

        public Road(String name, String type) {
            this.name = name;
            this.type = type;
            this.roads = new ArrayList<>();
        }

        public void addTurn(Road road, int length) {
            this.roads.add(new Pair<>(road, length));
        }

        @Override
        public String toString() {
            return type + ": " + name;
        }
    }

    public City(String name) {
        this.name = name;
        this.roads = new ArrayList<>();
    }

    public Road findRoad(String road_name) {
        for (Road road: this.roads) {
            if (road_name.equals(road.name)) {
                return road;
            }
        }
        return null;
    }

    public void addRoad(String road_name, String road_type, ArrayList<Pair<String, Integer>> connection_list) {
        Road new_road = new Road(road_name, road_type);
        this.roads.add(new_road);
        if (connection_list != null) {
            for (Pair<String, Integer> connection: connection_list) {
                Road road = this.findRoad(connection.first);
                new_road.addTurn(road, connection.second);
                road.addTurn(new_road, connection.second);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("City: " + name + '\n');
        for (Road road: roads) {
            res.append(road.toString()).append('\n');
        }
        return res.toString();
    }

    public void findWay(String road_name_from, String road_name_to) {
        HashMap<Road, Pair<Integer, Road>> ways = new HashMap<>();
        for (Road road: this.roads) {
            ways.put(road, new Pair<>(100000, null));
        }
        ArrayList<Road> not_visited = new ArrayList<>(this.roads);
        Road start = this.findRoad(road_name_from);
        ways.replace(start, new Pair<>(0, null));
        while (!not_visited.isEmpty()) {
            Road curr_v = null;
            int cost = 100000;
            for (Map.Entry<Road, Pair<Integer, Road>> vertex: ways.entrySet()) {
                if ((vertex.getValue().first < cost || curr_v == null) && not_visited.contains(vertex.getKey())) {
                    cost = vertex.getValue().first;
                    curr_v = vertex.getKey();
                }
            }
            for (Pair<Road, Integer> connection: curr_v.roads) {
                if (not_visited.contains(connection.first) && ways.get(connection.first).first > (cost + connection.second)) {
                    ways.replace(connection.first, new Pair<>(cost + connection.second, curr_v));
                }
            }
            not_visited.remove(curr_v);
        }
        ArrayList<Road> best_roads = new ArrayList<>();
        Road step = this.findRoad(road_name_to);
        while (step != null) {
            best_roads.add(step);
            step = ways.get(step).second;
        }
        StringBuilder result = new StringBuilder();
        for (int i = best_roads.size() - 1; i >= 0; i--) {
            result.append(best_roads.get(i));
            if (i != 0) {
                result.append(" -> ");
            }
        }
        System.out.println(result);
    }
}
