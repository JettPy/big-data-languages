package org.example;


import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

// Лабораторная работа 10
// Задание 1, 2
public class Main {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder().appName("TestingSpark").master("local[*]").getOrCreate();
        Dataset<Row> data = spark.read().format("csv").option("header", "true")
                .load("./lab10/src/main/resources/2023_rankings.csv");
        data.createOrReplaceTempView("universities");
        System.out.println("1st DataFrame:");
        spark.sql("SELECT * FROM universities").show(30, false);
        System.out.println("2nd DataFrame:");
        spark.sql("SELECT universities.name FROM universities WHERE universities.location = 'Russian Federation'").show(30, false);
        System.out.println("3rd DataFrame:");
        spark.sql("SELECT universities.name, universities.scores_teaching FROM universities WHERE universities.scores_teaching > 60").show(30, false);
        System.out.println("4th DataFrame:");
        spark.sql("SELECT universities.name, universities.rank FROM universities WHERE universities.location = 'China' AND universities.rank_order > 100").show(30, false);
        System.out.println("5th DataFrame:");
        spark.sql("SELECT universities.name, universities.aliases FROM universities WHERE universities.rank_order > 100").show(30, false);
        System.out.println("6th DataFrame:");
        spark.sql("SELECT COUNT(*) FROM universities WHERE universities.scores_citations_rank > 100").show();
        System.out.println("7th DataFrame:");
        spark.sql("SELECT universities.name FROM universities WHERE universities.scores_industry_income_rank < scores_international_outlook_rank").show(30, false);
        System.out.println("8th DataFrame:");
        spark.sql("SELECT universities.name, universities.subjects_offered FROM universities WHERE universities.location = 'Japan'").show(30, false);
        System.out.println("9th DataFrame:");
        spark.sql("SELECT * FROM universities ORDER BY 5").show(5, false);
        System.out.println("10th DataFrame:");
        spark.sql("SELECT universities.name, universities.rank FROM universities ORDER BY universities.rank_order DESC LIMIT 10").show(10, false);
        spark.stop();
    }
}