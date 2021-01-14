public class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
	    //원하는 주석 처리해드렸습니다 ㅋㅋ루삥뽕
            if(i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0) {
		System.out.println("buzz");
	    } else if (i % 15 == 0) {
		System.out.println("fizzbuzz");
	    }else {
                System.out.println(i);
            }
        }
	System.out.println("hansol manager :)");
   }

