/** Оперативная память. */
public class Memory {
    private MemoryType type;
    private int capacityGb;

    public Memory(MemoryType type, int capacityGb) {
        this.type = type;
        this.capacityGb = capacityGb;
    }

    public MemoryType getType() {
        return type;
    }

    public int getCapacityGb() {
        return capacityGb;
    }

    // Увеличение объема памяти
    public void upgrade(int additionalGb) {
        if (additionalGb > 0) {
            capacityGb += additionalGb;
        }
    }

    @Override
    public String toString() {
        return capacityGb + " ГБ " + type;
    }
}
