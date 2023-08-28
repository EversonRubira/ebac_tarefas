package pt.com.rubira;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {

        public static void main(String[] args) {
            Stream<String> stream = List.of("Everson", "Rosa", "Rubira").stream();

            Stream<String> set = Set.of("Everson", "Rosa", "Rubira").stream();

            Map<String, String> map = Map.of( "Everson",  "Rubira");
            Stream<String> chaves = map.keySet().stream();
            Stream<String> valores = map.values().stream();

            Stream<String> StreamSTS = Stream.of("String", "asds");
        }
    }

