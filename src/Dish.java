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

        public void setWouldRecommend(boolean wouldRecommend) {
            this.wouldRecommend = wouldRecommend;
        }

        public boolean getWouldRecommend() {
            return wouldRecommend;
        }
    }

     class DishTest {
        public static void main(String[] args) {

            Dish dish1 = new Dish(7000, "tuna", true);
                dish1.printSummary();
        }
    }

class DishTools {
    
            }
