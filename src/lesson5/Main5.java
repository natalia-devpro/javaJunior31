package lesson5;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Main5 {
    public static void main(String[] args) {
        /**
         * Есть текст (email от пользователя)
         * нужно понять валижный он или нет
         */

        String email = "::kfjvhdf---@---dfkgj---";
        if(!email.contains("@")){
            System.out.println("Эмаил не содержит собачку!!!");
            System.exit(0);
        }




        // 2 - сожержание пробелов
        /**
         * 3 - чтоб содержалась только одна собачка (***)
         * 4 - чтоб не начилась на спец символ
         * 5 -
         */



    }
}
