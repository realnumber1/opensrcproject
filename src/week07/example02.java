package week07;

public class example02 {
    public static void main(String [] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p); // p는 p.toString()으로 자동 변환
        System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
    }
}
