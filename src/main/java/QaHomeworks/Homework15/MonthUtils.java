package QaHomeworks.Homework15;


public class MonthUtils {

    public static final class Month {
        private final String name;
        private final int numberOfDays;
        private final int numberOfWorkDays;


        public Month(String name, int numberOfDays, int numberOfWorkDays) {
            this.name = name;
            this.numberOfDays = numberOfDays;
            this.numberOfWorkDays = numberOfWorkDays;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfDays() {
            return numberOfDays;
        }

        public int getNumberOfWorkDays() {
            return numberOfWorkDays;
        }

        public static Month[] getYear(){
            return MonthUtils.YEAR;
        }
        public static Month[] getWinter() {
            return new Month[]{YEAR[0], YEAR[1], YEAR[11]};
        }

        @Override
        public String toString() {
            return "Month{" +
                    "name='" + name + '\'' +
                    ", numberOfDays=" + numberOfDays +
                    ", numberOfWorkDays=" + numberOfWorkDays +
                    '}';
        }
    }


    public static final Month[] YEAR =
    {
        new Month("January", 31, 15),
        new Month("February", 28, 19),
        new Month("March", 31, 19),
        new Month("April", 30, 20),
        new Month("May", 31, 16),
        new Month("June", 30, 20),
        new Month("Jule", 31, 20),
        new Month("August", 31, 20),
        new Month("September", 30, 21),
        new Month("October", 31, 18),
        new Month("November", 30, 20),
        new Month("December", 31, 17)
    };
    public static final Month[] WINTER = {
            new Month("January", 31, 15),
            new Month("February", 28, 19),
            new Month("December", 31, 17)
    };
    public static final Month[] SPRING = {
            new Month("March", 31, 19),
            new Month("April", 30, 20),
            new Month("May", 31, 16)
    };
    public static final Month[] SUMMER = {
            new Month("June", 30, 20),
            new Month("Jule", 31, 20),
            new Month("August", 31, 20)
    };
    public static final Month[] AUTUMN = {
            new Month("September", 30, 21),
            new Month("October", 31, 18),
            new Month("November", 30, 20)
    };



}
