//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Задание значений");
        var dog = 8.0;
        System.out.println("количество собак=" + dog);
        var cat = 3.6;
        System.out.println("количество котов=" + cat);
        var paper = 763789;
        System.out.println("количество бумаги=" + paper);
        System.out.println("Задача 2. Увеличение на 4");
        dog = dog + 4;
        System.out.println("новое количество собак=" + dog);
        cat = cat + 4;
        System.out.println("новое количество котов=" + cat);
        paper = paper + 4;
        System.out.println("новое количество бумаги=" + paper);
        System.out.println("Задача 3. Уменьшение на ...");
        dog = dog - 3.5;
        System.out.println("dog-3.5=" + dog);
        cat = cat - 1.6;
        System.out.println("cat-1.6=" + cat);
        paper = paper - 7639;
        System.out.println("paper-7639=" + paper);
        System.out.println("Задача 4. Работа с переменной friend");
        var friend=19;
        System.out.println("friend="+friend);
        friend=friend+2;
        System.out.println("friend+2="+friend);
        friend=friend/7;
        System.out.println("friend/7="+friend);
        System.out.println("Задача 5. Работа с перменной frog");
        var frog=3.5;
        System.out.println("frog="+frog);
        frog=frog*10;
        System.out.println("frog*10="+frog);
        frog=frog/3.5;
        System.out.println("frog/3.5="+frog);
        frog=frog+4;
        System.out.println("frog+4="+frog);
        System.out.println("Задача 6. Боксёры");
        var boxerFirst=78.2;
        System.out.println("Вес 1-го боксёра="+boxerFirst+"кг");
        var boxerSecond=82.7;
        System.out.println("Вес 2-го боксёра="+boxerSecond+"кг");
        var weightTotal=boxerFirst+boxerSecond;
        System.out.println("Общий вес боксёров="+weightTotal+"кг");
        var weightDiff=boxerSecond-boxerFirst;
        System.out.println("Разница в весе="+weightDiff+"кг");
        System.out.println("Задача 7. Остаток от деления");
        var remFromDev=boxerSecond%boxerFirst;
        System.out.println("Остаток от деления веса боксёров = "+remFromDev+" кг");
        System.out.println("Задача 8. Решение с арифметическими функциями");
        var workTime=640;
        var standartTime=8;
        var workers=workTime/standartTime;
        System.out.println("1. Всего работников в компании "+workers+" человек");
        workers=workers+94;
        workTime=workers*standartTime;
        System.out.println("2. Если в компании работает "+workers+" человек, то всего "+workTime+" часов  работы может быть поделено между сотрудниками");





    }
}