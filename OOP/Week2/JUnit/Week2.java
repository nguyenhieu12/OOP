public class Week4 {
    /**
     * max.
     */
    public static int max2Int(int a, int b) {
        return (a < b ? b : a);
    }

    /**
     * min.
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    /**
     * BMI.
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight/Math.pow(height, 2);
        if(BMI < 18.5){
            return "Thiếu cân";
        }else if(BMI >= 18.5 && BMI <= 22.9){
            return "Bình thường";
        }else if(BMI >= 23 && BMI <= 24.9){
            return "Thừa cân";
        }else{
            return "Béo phì";
        }
    }
    
}
