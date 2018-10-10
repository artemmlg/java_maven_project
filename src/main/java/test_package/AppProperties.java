package test_package;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:shapes.properties")
public interface AppProperties extends Config {
    @Key("parallelogramA")
    Double parallelogramA();

    @Key("parallelogramB")
    Double parallelogramB();

    @Key("parallelogramH")
    Double parallelogramH();

    @Key("squareA")
    Double squareA();

}
