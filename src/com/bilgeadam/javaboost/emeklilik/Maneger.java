package com.bilgeadam.javaboost.emeklilik;
// package com.bilgeadam.boost.java.emeklilik;
//
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
//
// public class Maneger {
// public static List<Person> addRetiredPErson(Person retired) {
// List<Person> list = new ArrayList<Person>();
//
// try {
// Scanner scanner = new Scanner(System.in);
// System.out.println("lütfen isminiz giriniz");
// retired.setNameString(scanner.nextLine());
// System.out.println("lütfen Soy isiminizi giriniz");
// retired.setSurNameString(scanner.nextLine());
// retired.setBirtDate(formatBirthday());
// System.out.println("lütfen cinsiyetinizi giriniz");
// retired.setGender(Gender.MAN.name());
// ;
// list.add(retired);
//
// } catch (Exception e) {
// // TODO: handle exception
// }
//
// return list;
//
// }
//
// public static LocalDate formatBirthday() {
// LocalDate birthdayDate = null;
//
// try {
// Scanner scanner = new Scanner(System.in);
// DateTimeFormatter yeniFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
// DateTimeFormatter eskiFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd ");
// System.out.println("lütfendoğum tarihinizi şeklinde giriniz dddd.MMMM.yyyy
// ");
// String temp = scanner.nextLine();
// birthdayDate = LocalDate.parse(temp, yeniFormatter);
// // birthdayDate=LocalDate.parse(birthdayDate,eskiFormatter);
//
// return birthdayDate;
// } catch (Exception e) {
// // TODO: handle exception
// } finally {
//
// }
// return birthdayDate;
//
// }
//
// public static int calculatAge(LocalDate birthday) {
// long years = birthday.until(LocalDate.now(), ChronoUnit.YEARS);
//
// return (int) years;
//
// }
//
// public static void print(List<Person> list) {
// // list.forEach(temp -> temp.getBirtDate());
// list.forEach(System.out::println);
//
// }
//
// public static void calc(List<Person> list) {
//
// int a = LocalDate.now().getYear();
// int b = list.get(0).getBirtDate().getYear();
// int c = a - b;
// }
//
//// public static void calculateRetired(Person retired) {
////
//// if (true) {
////
//// if (calculatAge(retired.getBirtDate()) > 65) {
//// System.out.println("emekli oldunuz");
//// } else {
//// int age = 65 - calculatAge(retired.getBirtDate());
//// System.out.println("emekliliğinize" + age + "yıl vardır");
//// }
////
//// } else {
//// if (calculatAge(retired.getBirtDate()) > 60) {
//// System.out.println("emekli oldunuz");
//// } else {
//// int age = 60 - calculatAge(retired.getBirtDate());
//// System.out.println("emekliliğinize " + age + " yıl vardır");
//// }
////
//// }
//// }
//
// public static void main(String[] args) {
// // addRetiredPErson(new Retiredİnformation());
// // calculateRetired(addRetiredPErson(new Retiredİnformation()).get(0));
// print(addRetiredPErson(new Person()));
// }
//
// }
