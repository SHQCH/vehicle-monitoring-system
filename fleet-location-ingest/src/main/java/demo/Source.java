package demo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {
    String OUTPUT = "output";
    @Output
    MessageChannel output();
}
