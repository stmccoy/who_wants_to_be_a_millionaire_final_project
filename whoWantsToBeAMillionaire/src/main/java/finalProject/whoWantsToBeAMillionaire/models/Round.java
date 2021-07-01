package finalProject.whoWantsToBeAMillionaire.models;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = "rounds")
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "round_value")
    private int RoundValue;

    @Column(name = "round_display_string")
    private String RoundDisplayString;


    public Round(int roundValue, String roundDisplayString) {
        RoundValue = roundValue;
        RoundDisplayString = roundDisplayString;
    }

    public Round(String roundDisplayString) {
        RoundDisplayString = roundDisplayString;
    }

    public int getRoundValue() {
        return RoundValue;
    }

    public void setRoundValue(int roundValue) {
        RoundValue = roundValue;
    }

    public String getRoundDisplayString() {
        return RoundDisplayString;
    }

    public void setRoundDisplayString(String roundDisplayString) {
        RoundDisplayString = roundDisplayString;
    }

    public Round() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
