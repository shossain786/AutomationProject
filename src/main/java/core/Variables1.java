package core;

public class Variables1 {
    static void main() {
        boolean flag = true;
        double d = 10.34;
        char c = 'a';
        // not much in use
        short s = 1;
        byte b = 1;
    }
}
/*
Rules of Variable naming:

    1. Variable names should starts with char or _ or $ [(ie: name, s, _str, $abs -> valid) (1abc, &test, -abs etc)->invalid]
    2. Java Keywords can not be used for the variable naming (new, return, void, class etc)

Recommendation:
 - Use meaningful names( l, s, m, books, numbers)
 - Length should be followed within 4-16 chars.
 - Use camelCase(listFruits, midAgedPerson -> variables/methods)
 - For classes/Interafecs/Abstruct Class -> All the starting chars of Words should be Capital (ie: RedCircle, TataNano)
 */