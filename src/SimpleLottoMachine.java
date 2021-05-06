import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        // 45개의 공을 만든다
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 45; i++){
            list.add(i);
        }
        // 섞는다
        Collections.shuffle(list);
        // 뽑는다
        int[] pickedNum = new int[6];
        for (int i = 0; i < pickedNum.length; i++) {
            pickedNum[i] = list.remove(0);
        }

        // 결과 출력
        System.out.printf("자동 생성 번호: %s",Arrays.toString(pickedNum));
    }
}