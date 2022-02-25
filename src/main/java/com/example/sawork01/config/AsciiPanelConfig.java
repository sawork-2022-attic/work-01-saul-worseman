package com.example.sawork01.config;
import com.example.sawork01.asciipanel.AsciiFont;
import com.example.sawork01.asciipanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanelConfig {
    public static final AsciiFont CP437_8x8 = new AsciiFont("cp437_8x8.png", 8, 8);
    public static final AsciiFont CP437_10x10 = new AsciiFont("cp437_10x10.png", 10, 10);
    public static final AsciiFont CP437_12x12 = new AsciiFont("cp437_12x12.png", 12, 12);
    public static final AsciiFont CP437_16x16 = new AsciiFont("cp437_16x16.png", 16, 16);
    public static final AsciiFont CP437_9x16 = new AsciiFont("cp437_9x16.png", 9, 16);
    public static final AsciiFont DRAKE_10x10 = new AsciiFont("drake_10x10.png", 10, 10);
    public static final AsciiFont TAFFER_10x10 = new AsciiFont("taffer_10x10.png", 10, 10);
    public static final AsciiFont QBICFEET_10x10 = new AsciiFont("qbicfeet_10x10.png", 10, 10);
    public static final AsciiFont TALRYTH_15_15 = new AsciiFont("talryth_square_15x15.png", 15, 15);

    @Bean
    public AsciiPanel asciiPanel(){
        AsciiPanel asciiPanel = new AsciiPanel();
        asciiPanel.setAsciiFont(CP437_16x16);
        return asciiPanel;
    }

    @Bean
    public int[] size(){
        return new int[]{16, 16};
    }

}
