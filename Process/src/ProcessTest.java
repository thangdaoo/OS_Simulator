import java.util.LinkedList;
import java.util.List;

public class ProcessTest {

	public static void main(String[] args) throws InterruptedException {
		List<Process> processes = new LinkedList<>();
		
		String[] instructions = new String[0];
		String[] priority = {"High","Medium","Low"};
		int counter = 0;
		String runState = "RUNNING";
		String readyState = "READY";
		int id = 0;
		
		
		for (int i = 0; i < 500; i++) {
			int random = (int)(Math.random() * 10) + 1;
			int quantum = (int)(Math.random() * 10) + 1;
			int priorityNum = (int)(Math.random() * 2);
			
			if (i % random == 0) {
				Process currentProcess = new Process(id);
				processes.add(currentProcess);
				System.out.println("Process " + currentProcess.ID + " " + runState + "\nPriority: " + priority[priorityNum] + "\nQuantum:" + " " + quantum + "\n");
				id = currentProcess.returnID() + 1;
				Thread.sleep(quantum);
			}
			
			if (i % random == 1) {
				if (processes.size() > 0) {
					Process currentProcess = processes.remove(0);
					System.out.println("Process " + currentProcess.ID + " " + readyState + "\nPriority: Low\n"); 
					}
				}
			Thread.sleep(1500);
			}	
 		}
	}

