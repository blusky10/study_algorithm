package programers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Sanghyun KIM on 2019-02-11.
 */
// Level 1 완주하지 못한 선수
public class Hash0001 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden", "kiki"};
        String[] completion = {"kiki", "eden"};
        solution(participant, completion);
    }

    public static String solution(String[] participant, String[] completion) {

        Map<String, Long> participantMap = Arrays.asList(participant).stream().collect(
                Collectors.groupingBy(
                        s -> s, Collectors.counting()
                )
        );

        Arrays.asList(completion).stream().forEach(
                s-> {
                    Long aLong = participantMap.get(s);
                    participantMap.put(s, aLong-1);
                }
        );
        return  participantMap.entrySet().stream()
                .filter(x -> x.getValue() > 0)
                .map(x -> x.getKey())
                .collect(Collectors.joining(","));
    }
}
