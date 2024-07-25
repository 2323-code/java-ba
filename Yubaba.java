import java.util.Random;
import java.util.Scanner;

class Yubaba {
  public static void main(String[] args) {
    // 名前を受け付ける
    Scanner scanner = new Scanner(System.in);
    System.out.println("契約書だよ、そこに名前を書きな。");
    String name = scanner.nextLine();
    System.out.println("ふん, " + name + "というのかい、贅沢な名だねえ。");

    // 名前の文字数を出す
    int nameLength = name.length();

    // ランダムにインデックスを指定
    Random random = new Random();
    int index = random.nextInt(nameLength);
    System.err.println("index: " + index);
    // 出力
    String newName = name.substring(index);
    System.out.println("今からお前の名前は" + newName + "だ。いいかい、" + newName + "だよ。分かったら返事をするんだ、" + newName + "!!");
    scanner.close();
  }
}