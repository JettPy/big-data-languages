package lab7;

import java.util.*;

// Лабораторная работа 7
// Вариант 4
// Задание 2
public class FindWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String initial_text = scanner.nextLine();
//        String initial_text = """
//                It goes without saying that humans (mammals identifiable as those that stand upright and are comparatively advanced and capable of detailed thought) have pretty remarkable bodies, given all that they've accomplished. Furthermore, an especially intelligent human brain produced this text! To be sure, humans have overcome predators, disease, and all sorts of other obstacles over thousands of years.
//                To fully understand and appreciate these accomplishments, let's take at some of the most well-known parts of the human body!
//                The head, or the spherical body part that contains the brain and rests at the top of the human body, has quite a few individual organs and body parts on it. It should quickly be mentioned that hair occupies the space on top of the head, and the ears, the organs responsible for hearing, are located on either side of the head. From top to bottom, the eyebrows, or horizontal strips of hair that can be found above the eye, are the first components of the head. The eyes are below them, and are round, orb-like organs that allow humans to see.
//                The eyes make way for the nose, or an external (sticking-out) organ that plays an important part in the breathing and bacteria-elimination processes. Below that is the mouth, or a wide, cavernous organ that chews food, removes bacteria, helps with breathing, and more. The mouth contains teeth, or small, white-colored, pointed body parts used to chew food, and the tongue, or a red-colored, boneless organ used to chew food and speak.
//                The neck is the long body part that connects the head to the chest (the muscular body part that protects the heart and lungs), and the stomach, or the part of the body that contains food and liquid-processing organs, comes below that.
//                The legs are the long, muscular body parts that allow humans to move from one spot to another and perform a variety of actions. Each leg contains a thigh (a thick, especially muscular body part used to perform strenuous motions; the upper part of the leg) and a calf (thinner, more flexible body part that absorbs the shock associated with movement; the lower part of the leg). Feet can be found at the bottom of legs, and each foot is comprised of five toes, or small appendages that help balance.
//                Arms are long, powerful body parts that are located on either side of chest, below the shoulders;arms are comprised of biceps (the thicker, more powerful upper portion), and forearms (the thinner, more flexible lower portion). Hands, or small, gripping body parts used for a tremendous number of actions, are at the end of arms. Each hand contains five fingers, or small appendages used to grip objects.
//                The aforementioned shoulders are rounded body parts that aid arms' flexibility. One's back is found on the opposite side of the stomach, and is a flat section of the body that contains important muscles that're intended to protect the lungs and other internal organs, in addition to helping humans perform certain motions and actions.""";
        String[] words = initial_text.replaceAll("[,\"():]", "").toLowerCase().split("\\s+");
        System.out.println("Введите список слов:");
        String[] words_list = scanner.nextLine().split(" ");
//        String[] words_list = {"the", "is", "body", "are"};
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words_list) {
            counter.put(word, 0);
        }
        for (String word : words) {
            if (counter.get(word) == null)
                continue;
            counter.replace(word, counter.get(word) + 1);
        }
        List<Pair<String, Integer>> sorted_counter = new ArrayList<>();
        for (Map.Entry<String, Integer> word_count: counter.entrySet()) {
            sorted_counter.add(new Pair<>(word_count.getKey(), word_count.getValue()));
        }
        sorted_counter.sort((p1, p2) -> {
            if (p2.second - p1.second == 0) {
                return p1.first.compareTo(p2.first);
            } else {
                return p2.second - p1.second;
            }
        });
        for (Pair<String, Integer> sorted_word: sorted_counter) {
            System.out.println(sorted_word.first + ": " + sorted_word.second);
        }
    }
}
