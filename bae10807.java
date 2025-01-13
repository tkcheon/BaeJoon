public class bae10807 {
    
}



/*    --- Scanner 사용 --- 
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];
        int count = 0;

        for(int i=0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0; i<array.length; i++){
            if(array[i]==x) count++;
        }
        
        System.out.println(count);

        sc.close();
        }
    }
*/


/* --- BufferedReader 사용 --- 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
    //System.in :표준 입력 스트림으로 바이트 단위로 데이터 읽음
    //InputStreamReader : 바이크 기반 입력을 문자 기반 입력 스트림으로 변경 
    //BufferedReader : 입력 스트림에 버퍼링을 추가하여 입력 성능 향상시켜 문자열 단위로 데이터 읽음 
    //버퍼링 : 데이터를 일정량 모아서 처리하여 성능 개선 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    //BufferedReade.readLine() : 한 줄 단위로 데이터를 읽을 수 있음. 
    //들어와야 하는 값은 숫자이기 때문에 Integer.parseInt로 숫자포맷으로 변환
    int n = Integer.parseInt(br.readLine());
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(br.readLine());

    for(int i=0; i<n; i++){
        if(Integer.parseInt(st.nextToken())==x) count ++;
    }

    System.out.println(count);
    br.close();
    }
}


 */