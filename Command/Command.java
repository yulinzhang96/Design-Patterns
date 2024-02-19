// The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
public interface Command {
  public void execute();
  public void undo();
}
