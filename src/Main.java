public class Main {
        public static void main(String[] args) {
            // Задание 1

            var a = 5;
            int b = 8;
            byte c = 1;
            short d = 99;
            long e = 8667L;
            double f = 5.55;
            float g = 7.78765f;
            //boolean trueFalse = b != 3;//True - ругался при пушах
            //boolean h = 5 > 10;//False - ругался при пушах
            char j = 74;
            //System.out.println("j = " + j);

            // Задание 2

            float boxer1 = 78.2f;
            float boxer2 = 82.7f;
            float WeightOfAllBoxers = boxer1 + boxer2;
            float DifferentWeightBoxers = boxer2 % boxer1;
            System.out.println("Суммарный вес боксеров " + WeightOfAllBoxers + " кг");
            System.out.println("Разница в весе боксеров " + DifferentWeightBoxers + " кг");

            // Задание 3

            byte cntbananas = 5;
            byte weightOneBanana = 80;
            short valumeMilk = 200;// больше 127
            byte oneportionmilk = 100;
            byte weigthPortionMilk = 105;
            byte cntIcecream = 2;
            byte weightOneIcecream = 100;
            byte cnteggs = 4;
            byte weightegg = 70;
            int weightBananas = cntbananas * weightOneBanana;
            int weightMilk = valumeMilk / oneportionmilk * weigthPortionMilk;
            int weightIcecream = cntIcecream * weightOneIcecream;
            int weightEggs = cnteggs * weightegg;
            int weightBreakfestg = weightBananas + weightMilk + weightIcecream + weightEggs;
            System.out.println("Общий вес завтрака спортсмена " + weightBreakfestg + " грамм");
            float weightBreakfastkg = weightBreakfestg / 1000f;
            System.out.println("Общий вес завтрака спортсмена " + weightBreakfastkg + " кг");

            // Задание 4

            byte deltakg = 7;
            short volumeKg = 1000;
            short diet1 = 250;
            short diet2 = 500;
            byte cntDiet = 2;
            int deltaGramm = deltakg * volumeKg;
            int cntDaysDiet1 = deltaGramm / diet1;
            int cntDaysDiet2 = deltaGramm / diet2;
            int aveDays = (cntDaysDiet1 + cntDaysDiet2)/cntDiet;
            System.out.println("Кол-во дней при 250 гр в день = " + cntDaysDiet1 + " дней");
            System.out.println("Кол-во дней при 500 гр в день = " + cntDaysDiet2 + " дней");
            System.out.println("В среднем потребуется " + aveDays + " день");

            // Задание 5
            float percent = 0.1f;
            int Maria = 67_760;
            int Den = 83_690;
            int Kris = 76_230;
            byte month = 12;
            int yearMaria = Maria * month;
            int yearDen = Den * month;
            int yearKris = Kris * month;
            float upMaria = Maria * percent;
            float upDen = Den * percent;
            float upKris = Kris * percent;
            int newMaria = (int)upMaria + Maria;// убираем плавующую точку
            int newDen = (int)upDen + Den;
            int newKris = (int)upKris + Kris;
            int newYearMaria = newMaria * month;
            int newYearDen = newDen * month;
            int newYearKris = newKris * month;
            int deltaYearMaria = newYearMaria -  yearMaria;
            int deltaYearDen = newYearDen - yearMaria;
            int deltaYearKris = newYearKris - yearMaria;
            System.out.println("Маша теперь получает " + newMaria + " рублей. Годовой доход вырос на " + deltaYearMaria + " рублей");
            System.out.println("Денис теперь получает " + newDen + " рублей. Годовой доход вырос на " + deltaYearDen + " рублей");
            System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + deltaYearKris + " рублей");

        }
    }
