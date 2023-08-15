package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {
    private String IP;
    private int port;

    public IpPort(String IP, int port) {
        this.IP = IP;
        this.port = port;
    }
}
