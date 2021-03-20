package main;

// chap02
// code02-01
//public class Main {
//    public static void main(String[] args) {
//        int a;
//        int b;
//        a = 20;
//        // オペランド 演算子 オペランド 演算子 オペランド
//        // オペランドの中でも数字や文字列などの値のことをリテラルと呼ぶ
//        // リテラルはデータ型を持つ
//        // 整数リテラルは先頭に0x をつけると16進数と解釈される 0x11 は 10進数 17
//        // 整数リテラルは先頭に0 をつけると8進数と解釈される 010 は 10進数 8
//        // 整数リテラルは先頭に0b をつけると2進数と解釈される 0b0011 は 10進数 3
//        b = a + 5;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

// code02-02 エスケープシーケンスなしでエラーになる
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("私の好きな記号は二重引用符(")です");
//    }
//}

// オペランドには整数や文字列の他にも、変数、定数、命令の実行結果などがある

// code02-03 エスケープシーケンス使用
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("私の好きな記号は二重引用符(\")です");
//        System.out.println("私の好きな記号は二重引用符\"です");
//    }
//}

// Javaでの演算評価の優先順位と結合規則があるので覚えておこう
// 整数同士の除算は結果が尚になるので注意 9 / 2 の結果は4に、9.0 / 2 の結果は4.5になる

// code02-04 インクリメント(++)とデクリメント(--)
//public class Main {
//    public static void main(String[] args) {
//        int a;
//        a = 100;
//        a++;
//        System.out.println(a); // 実行結果: 101
//
//        // ++ や-- を他の演算子と一緒に使わない！
//        int x = 10;
//        int y = 10;
//        // 変数x の値が1増えたあとに、50加算される
//        System.out.println(++x + 50); // 実行結果 61
//        // 変数y の値に50加算されたものが画面に表示されたあとに、yの値が1増える
//        System.out.println(y++ + 50); // 実行結果 60
//        System.out.println(y); // 実行結果 11
//    }
//}

// 各数値型の意味的な大小関係
// byte < short < int < long < float < double
// code02-05 値より大きな型の変数に代入
//public class Main {
//    public static void main(String[] args) {
//        float f = 3; // float型の変数に int型を代入 (自動的に型変換される)
//        double d = f; // double型の変数に float型を代入 (自動的に型変換される)
//        System.out.println(f); // 表示結果: 3.0
//        System.out.println(d); // 表示結果: 3.0
//    }
//}

// 代入時の自動型変換
// code02-06 データより小さな方の変数に代入するとエラーになる
//public class Main {
//    public static void main(String[] args) {
//        int i = 3.2; // java: 不適合な型: 精度が失われる可能性があるdoubleからintへの変換
//        System.out.println(i);
//    }
//}

// byte型やshort型の変数にint型リテラルを実害がない範囲で単純代入することは例外的に認められている

// 強制的な型変換(キャスト演算子)
// code02-07
//public class Main {
//    public static void main(String[] args) {
//        int i = (int) 3.2; // キャスト演算子(int) で強制的に代入
//        System.out.println(i); // 実行結果: 3
//    }
//}

// 演算時の自動型変換
// code02-08
//public class Main {
//    public static void main(String[] args) {
//        double d = 8.5 / 2; // int型の2 をdouble型の2.0に自動変換される
//        long l = 5 + 2L; // int型の5 を long型の5Lに自動変換される
//        System.out.println(d); // 実行結果: 4.25
//        System.out.println(l); // 実行結果: 7
//    }
//}

// code02-09 文字列の連結
//public class Main {
//    public static void main(String[] args) {
//        String msg = "私の年齢は" + 23; // int型 23 が String型に変換されて連結される
//        System.out.println(msg); // 実行結果: 私の年齢は23
//    }
//}

// code02-10 命令(画面出力)実行の文
//public class Main {
//    public static void main(String[] args) {
//        String name = "すがわら";
//        String message;
//        message = name + "さん、こんにちは";
//        // System.out.println(引数またはパラメータ);
//        System.out.println(message); // 実行結果: すがわらさん、こんにちは
//    }
//}

// code02-11 改行なし画面出力の命令 System.out.print(引数またはパラメータ);メソッド
//public class Main {
//    public static void main(String[] args) {
//        String name = "すがわら";
//        // System.out.print(引数またはパラメータ);メソッド
//        System.out.print("私の名前は");
//        System.out.print(name);
//        System.out.print("です");
//        // 実行結果: 私の名前はすがわらです
//    }
//}

// code02-12 大きいほうの数字を選択させる命令 Math.max(a, b);メソッド
//public class Main {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        // Math.max(a, b);メソッド
//        int m = Math.max(a, b);
//
//        System.out.println("比較実験：" + a + "と" + b + "とで大きい値は" + m);
//        // 実行結果: 比較実験：5と3とで大きい値は5
//    }
//}

// code02-13 文字列を数字に変換する命令 Integer.parseInt(引数);メソッド
//public class Main {
//    public static void main(String[] args) {
//        String age = "31"; // 整数として読むことができる文字列を代入(数字ではない文字列だとエラーになる)
//        // Integer.parseInt(引数);メソッド
//        int n = Integer.parseInt(age);
//        System.out.println("あたなは来年" + (n + 1) + "歳になりますね。");
//        // 実行結果:あたなは来年32歳になりますね。
//    }
//}

// code02-14 ランダムな数を生成する命令
//public class Main {
//    public static void main(String[] args) {
//        // new java.util.Random().nextInt(引数);メソッド
//        int r = new java.util.Random().nextInt(90);
//        System.out.println("あたなはたぶん、" + r + "歳ですね？");
//        // 実行結果:あたなはたぶん、83歳ですね？
//    }
//}

// code02-15 キーボードから入力を受け付ける命令
public class Main {
    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください");
        // new java.util.Scanner(System.in).nextLine();メソッド
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("あなたの年齢を入力してください");
        // new java.util.Scanner(System.in).nextInt();メソッド
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ、" + age + "歳の" + name + "さん");
    }
}
