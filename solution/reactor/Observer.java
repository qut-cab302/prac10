package reactor;

/**
 * Observer interface as part of the Observer Pattern code
 *
 */
public interface Observer {
    /**
     * Query the subject to determine what was the change of state
     * and respond appropriately based on the subject's new state.
     *
     * @param s The subject that has been updated.
     */
    public void update(Subject s);
}
