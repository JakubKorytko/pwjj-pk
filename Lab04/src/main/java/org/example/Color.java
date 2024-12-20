package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="colors")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="red", nullable=false)
    public int red;

    @Column(name="green", nullable=false)
    public int green;

    @Column(name="blue", nullable=false)
    public int blue;

    @Column(name="alpha", nullable=false)
    public int alpha;

    public Color(int red, int green, int blue, int alpha) {
        boolean lessThan0 = red < 0 ||  green < 0 ||  blue < 0 || alpha < 0;
        boolean greaterThan255 = red > 255 || green > 255 || blue > 255 || alpha > 255;
        if (greaterThan255 || lessThan0) {
            throw new IllegalArgumentException("Invalid color");
        }

        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public Color() {
        this(0, 0, 0, 0);
    }

    public Color(int red) {
        this(red, 0, 0, 0);
    }

    public Color(int red, int green) {
        this(red, green, 0, 0);
    }

    public Color(int red, int green,  int blue) {
        this(red, green, blue, 0);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
