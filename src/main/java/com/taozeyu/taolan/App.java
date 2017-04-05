package com.taozeyu.taolan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.taozeyu.taolan.analysis.LexicalAnalysisException;
import com.taozeyu.taolan.analysis.SyntacticAnalysisException;
import com.taozeyu.taolan.intermediatecode.IntermediateCodeExpression;
import com.taozeyu.taolan.virtualMachine.VirtualMachine;

public class App {
	public static void main(String[] args) throws SyntacticAnalysisException, LexicalAnalysisException, IOException, IntermediateCodeExpression {
		String base = App.class.getClassLoader().getResource("").getPath();
		String path = base + File.separator + "script" + File.separator + "test.t";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		VirtualMachine vm = VirtualMachine.instance();
		vm.run(isr);
	}
}
