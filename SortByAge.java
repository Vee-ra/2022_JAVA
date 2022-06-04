import java.util.Comparator;

public class SortByAge implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		//for ASC o1 - o2
		//for DSC o2 - o1
		return o2.age - o1.age;
				
	}

	
}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class TestPeople {
//    public static void main(String[] args) {
//        ArrayList<People> peps = new ArrayList<>();// Be specific, to avoid
//                                                    // classCast Exception
//
//        TestPeople test = new TestPeople();
//
//        peps.add(test.new People(123, "M", 14.25));
//        peps.add(test.new People(234, "M", 6.21));
//        peps.add(test.new People(362, "F", 9.23));
//        peps.add(test.new People(111, "M", 65.99));
//        peps.add(test.new People(535, "F", 9.23));
//
//        /*
//         * Collections.sort(peps);
//         * 
//         * for (int i = 0; i < peps.size(); i++){
//         * System.out.println(peps.get(i)); }
//         */
//
//        // The above code can be replaced by followin:
//
//        peps.sort((People p1, People p2) -> p1.getid() - p2.getid());
//
//        peps.forEach((p) -> System.out.println(" " + p.toString()));
//
//    }
//
//    private class People {
//        private int id;
//
//        @Override
//        public String toString() {
//            return "People [id=" + id + ", info=" + info + ", price=" + price + "]";
//        }
//
//        private String info;
//        private double price;
//
//        public People(int newid, String newinfo, double newprice) {
//            setid(newid);
//            setinfo(newinfo);
//            setprice(newprice);
//        }
//
//        public int getid() {
//            return id;
//        }
//
//        public void setid(int id) {
//            this.id = id;
//        }
//
//        public String getinfo() {
//            return info;
//        }
//
//        public void setinfo(String info) {
//            this.info = info;
//        }
//
//        public double getprice() {
//            return price;
//        }
//
//        public void setprice(double price) {
//            this.price = price;
//        }
//    }
//}