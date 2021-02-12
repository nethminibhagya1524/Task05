package football;

import java.util.Arrays;
import java.util.List;

public class Football02 {
  public static void main(String[] args) {
    List<Society> table = Arrays.asList(
        new Society(1, "FC Barcelona", 15, 24, 700, 400, 12, 65, 98, 156, 258, 222),
        new Society(2, "Real Madrid", 78, 852, 45, 69, 321, 56, 451, 956, 325, 400),
        new Society(3, "Manchester United", 15, 24, 56, 78, 654, 235, 451, 987, 325, 154),
        new Society(4, "Juventus FC", 22, 14, 1, 7, 664, 418, 246, 40, 5, 68),
        new Society(5, "FC Bayem Munich", 22, 14, 663, 437, 226, 70, 46, 5, 7, 68),
        new Society(6, "Tottenham Hotspur",2, 9, 672, 527, 145, 77, 54, 9, 4, 61),
        new Society(7, "Arsenal", 22, 0, 11, 497, 482, 15, 62, 54, 6, 4),
        new Society(8, "Borussia Dortmund", 22, 10, 0, 12, 444, -70, 45, 50, 5, 49),
        new Society(9, "Inter Milan", 22, 9, 1, 12, 553, 575, -22, 53, 61, 48),
        new Society(10, "LeicesterCity", 22,14, 442, 578, -136, 46, 57, 4, 6, 40)

     table.forEach(k -> System.out.println(k));
        System.out.println();
        table.parallelStream().forEach(System.out::println);
      }
    }

