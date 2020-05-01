package com.dualexec.vchest.parts;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class TestJob extends Job {

	public TestJob() {
		super("Fetch Todos from http://www.mocky.io webserver");
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		monitor.beginTask("Starting..", 100);

		Thread.currentThread();
		// try {
		try {
			monitor.worked(20);
			Thread.sleep(2000);
			monitor.worked(50);
			Thread.sleep(1000);
			monitor.worked(80);
			System.out.println("Hello from Job");
			monitor.worked(90);
			Thread.sleep(1000);
			monitor.done();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		} catch (IOException e) {
//			return new Status(Status.ERROR, "", e.getMessage(), e);
//		}
		return Status.OK_STATUS;
	}

}
