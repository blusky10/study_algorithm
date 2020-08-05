package codewars;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

//number(Arrays.asList()) # => []
//number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
public class LineNumbering {
    public static List<String> number(List<String> lines) {
        if (lines.isEmpty()){
            return lines;
        }else{
            AtomicInteger index = new AtomicInteger();
            return lines.stream().map(s -> index.getAndIncrement()+1 + ": " + s).collect(Collectors.toList());
        }
    }
}
