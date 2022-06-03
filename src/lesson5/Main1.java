package lesson5;

public class Main1 {
    public static void main(String[] args) {
        // К нам приходит путь к картинке
        // нужно папечатать картинка это или нет

        // C:\Users\EasyUM-8\Downloads\log4j-1.2.17.jar
        String pathToImage = "C:\\Users\\EasyUM-8\\Downloads\\log4j-1.2.17.png";
        if(pathToImage.endsWith(".png") || pathToImage.endsWith(".jpeg")){
            System.out.println("Это картинка!");
        }else {
            System.out.println("Это не картинка!");
        }

    }
}
