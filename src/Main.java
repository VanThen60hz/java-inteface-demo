public class Main {
    public static void main(String[] args) {
        // Tạo một mảng chứa các hình
        Shape[] shapes = {
                new Circle(2.5),
                new Rectangle(3, 4)
        };

        // Lặp qua từng hình trong mảng và tính diện tích
        for (Shape shape : shapes) {
            System.out.printf("Diện tích: %.2f%n", shape.area());
        }
    }
}