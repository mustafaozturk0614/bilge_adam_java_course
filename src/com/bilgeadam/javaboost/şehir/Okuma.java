// package com.bilgeadam.javaboost.şehir;
//
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.StringTokenizer;
// import java.util.stream.Collectors;
//
// public class Okuma {
// static File file = new File("E:\\file\\books.csv");
//
// public static void main(String[] args) throws FileNotFoundException,
// IOException {
// Okuma okuma = new Okuma();
// String emptyString = "";
// String[][] bin = new String[1000][8];
// ArrayList<String> arrayList = new ArrayList<String>();
//
// arrayList.add(emptyString);
//
// try (BufferedReader bufferedReader = new BufferedReader(new
// FileReader(file))) {
// while (true) {
// String lineString = bufferedReader.readLine();
// if (lineString == null) {
// break;
// }
// StringTokenizer tokenizer = new StringTokenizer(lineString, "");
//
// while (tokenizer.hasMoreElements()) {
//
// emptyString = (String) tokenizer.nextToken();
//
// arrayList.add(new city);
//
// }
//
// }
// }
// System.out.println("*****" + arrayList.get(10));
// int k;
// String a;
// String b = "";
// for (int i = 0; i < 1000; i++) {
// a = (String) arrayList.get(i);
//
// for (int j = 0; j < 8; j++) {
// k = 0;
// StringTokenizer tokString = new StringTokenizer(a, ";");
// while (tokString.hasMoreElements()) {
// b = (String) tokString.nextElement();
// kütüphaneList.add(b);
// bin[i][k] = b;
// okuma.setBook_id(b);
// k++;
// }
//
// }
// }
//
// // System.out.println(bin[2][0]);
// // System.out.println(bin[2][2] + "-" + bin[2][5]);
// String[] aList = arrayList.toArray().toString().split(";");
// // for (String string : aList) {
// // System.out.println(string);
// // }
//
// // System.out.println(aList[4].equalsIgnoreCase("The Hunger Games"));
//
// // arrayList.stream().filter((temp) -> temp.equalsIgnoreCase("The Hunger
// // Games"));
// // ;
//
// List<String> o = arrayList.stream().filter(temp -> temp.contains("Harry
// Potter")).collect(Collectors.toList());
//
// for (String string : o) {
// System.out.println(string);
// }
//
// }
//
// public static File getFile() {
// return file;
// }
//
// public static void setFile(File file) {
// Okuma.file = file;
// }
//
// public static List<String> getKütüphaneList() {
// return kütüphaneList;
// }
//
// public static void setKütüphaneList(List<String> kütüphaneList) {
// Okuma.kütüphaneList = kütüphaneList;
// }
//
// public String getBook_id() {
// return book_id;
// }
//
// public void setBook_id(String book_id) {
// this.book_id = book_id;
// }
//
// public String getIsbn() {
// return isbn;
// }
//
// public void setIsbn(String isbn) {
// this.isbn = isbn;
// }
//
// public String getAuthors() {
// return authors;
// }
//
// public void setAuthors(String authors) {
// this.authors = authors;
// }
//
// public String getOriginal_publication_year() {
// return original_publication_year;
// }
//
// public void setOriginal_publication_year(String original_publication_year) {
// this.original_publication_year = original_publication_year;
// }
//
// public String getOriginal_title() {
// return original_title;
// }
//
// public void setOriginal_title(String original_title) {
// this.original_title = original_title;
// }
//
// public String getTitle() {
// return title;
// }
//
// public void setTitle(String title) {
// this.title = title;
// }
//
// public String getLanguage_code() {
// return language_code;
// }
//
// public void setLanguage_code(String language_code) {
// this.language_code = language_code;
// }
//
// public String getAverage_rating() {
// return average_rating;
// }
//
// public void setAverage_rating(String average_rating) {
// this.average_rating = average_rating;
// }
//
// }
