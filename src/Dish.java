    //mini-exercise:
    public class Dish {
        private int costInCents;
        private String nameOfDish;
        private boolean wouldRecommend;

        public String getDish() {
            return "\nCost In Cents: " + costInCents + "\n" +
                    "Name OF Dish: " + nameOfDish + "\n" +
                    "Would Recommend: " + wouldRecommend + "\n";
        }

        //constructor
        public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
            this.costInCents = costInCents;
            this.nameOfDish = nameOfDish;
            this.wouldRecommend = wouldRecommend;

        }

        public void printSummary() {
            System.out.println("\nCost: " + costInCents +
                    "\n" + "Name: " + nameOfDish +
                    "\n" + "Recommended: " + wouldRecommend + "\n");
        }


        public void setCostInCents(int costInCents) {
            this.costInCents = costInCents;
            }

        public int getCostInCents() {
            return costInCents;
            }

        public void setNameOfDish(String nameOfDish){
            this.nameOfDish = nameOfDish;
            }

        public String getNameOfDish() {
            return nameOfDish;
            }

        public void isWouldRecommend(boolean wouldRecommend) {
            this.wouldRecommend = wouldRecommend;
        }

        public boolean getWouldRecommend() {
            return wouldRecommend;
        }
    }

    class DishTools {
        static final int AVG_COST_OF_DISH_IN_CENT = 13000;

        public static void shoutDishName(Dish dish) {
            System.out.println(dish.getNameOfDish().toUpperCase());
        }

        public static void analyzeDishCost(Dish dish) {
            String moreOrLess =
                    (dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENT) ? "More" : "Less";

            System.out.println(moreOrLess + " expensive than average");
        }

            public static void flipRecommendation(Dish dish) {
            dish.getWouldRecommend(!dish.isWouldRecommend());
            }
    }

     class DishTest {
        public static void main(String[] args) {

            Dish dish1 = new Dish(7000, "tuna", true);
            dish1.printSummary();
            DishTools.flipRecommendation(dish1);
            DishTools.shoutDishName(dish1);
            DishTools.analyzeDishCost(dish1);
        }
    }


