package pojo;

import java.math.BigDecimal;
import java.nio.channels.ClosedByInterruptException;

public class Credit extends Account {

    private BigDecimal credit;

    public Credit(String id, BigDecimal credit) {
        super(id);
        this.credit = credit;
    }

    public BigDecimal getCredit() {
        return this.credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    @Override
    public Account clone() {
        return new Credit(super.getId(), this.credit);
    }


}
