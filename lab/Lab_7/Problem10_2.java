public class Problem10_2 {
    public static void main(String[] args) {
        BMI bmi = new BMI("Rodney King", 19, 230, 60, 15);
        System.out.printf("%s is age %s and is %s\" tall%nwith a" +
        "weight of %s lbs.%nHis status is %s.",
        bmi.getName(), bmi.getAge(), bmi.getHeight(), bmi.getWeight(), bmi.getStatus());
    }

    private static class BMI {
         double kilosPerLbs = 0.45359237;
         double metersPerInch = 0.0254;
         String name;
         int age;
         double weight; // in pounds
         double height; // in inches

        BMI(String name, int age, double weight, double feet,
            double inches) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = (feet * 12) + inches;
        }

        public String getStatus() {
            double bmi = getBMI();
            if (bmi < 18.5)
                return "Underweight";
            else if (bmi < 25)
                return "Normal";
            else if (bmi < 30)
                return "Overweight";
            else
                return "Obese";
        }

        double getBMI() {
            double bmi = weight * kilosPerLbs /
                    ((height * metersPerInch) * (height * metersPerInch));
            return Math.round(bmi * 100) / 100.0;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        double getWeight() {
            return weight;
        }

        double getHeight() {
            return height;
        }
    }
}