package org.dnal.dnalc.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.dnal.compiler.generate.GenerateVisitor;
import org.dnal.core.DListType;
import org.dnal.core.DStructType;
import org.dnal.core.DType;
import org.dnal.core.DValue;
import org.dnal.core.logger.Log;
import org.dnal.core.nrule.NRule;

public class CustomGenerator implements GenerateVisitor {
    public List<String> outputL = new ArrayList<>();
    
    @Override
    public void startStructType(String name, DStructType dtype) {
        String s = String.format("TYPE %s", name);
        outputL.add(s);
    }
    @Override
    public void startEnumType(String name, DStructType dtype) {
        String s = String.format("TYPE %s", name);
        outputL.add(s);
    }
    @Override
    public void startType(String name, DType dtype) {
        String s = String.format("TYPE %s", name);
        outputL.add(s);
    }
    
    @Override
    public void startListType(String name, DListType type) {
        String s = String.format("TYPE %s", name);
        outputL.add(s);
    }


    @Override
    public void endType(String name, DType type) {
    }

    @Override
    public void structMember(String name, DType type) {
    }

    @Override
    public void rule(int index, String ruleText, NRule rule) {
    }

    @Override
    public void value(String name, DValue dval, DValue parentVal) {
        String s = String.format("VALUE %s", name);
        outputL.add(s);
    }
    

    @Override
    public void startList(String name, DValue value) {
        String s = String.format("VALUE %s", name);
        outputL.add(s);
    }

    @Override
    public void endList(String name, DValue value) {
    }

    @Override
    public void startStruct(String name, DValue dval) {
        String s = String.format("VALUE %s", name);
        outputL.add(s);
    }

    @Override
    public void endStruct(String name, DValue value) {
    }
    @Override
    public void enumMember(String name, DType memberType) throws Exception {
    }

    @Override
    public void finish() {
		Log.log(" ");
		Log.log("output: ");
		for(String line: this.outputL) {
			Log.log(" " + line);
		}
    	
    }
}
