public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Use an Iterator to safely remove elements during iteration
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i == 3) {
                iterator.remove();
            }
        }

        System.out.println(list); // Output: [1, 2, 4, 5]
    }
}