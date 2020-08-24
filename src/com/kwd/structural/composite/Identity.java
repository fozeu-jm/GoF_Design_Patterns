package com.kwd.structural.composite;
import java.util.List;

public interface Identity {
	 public void add(Identity e);
	 public void remove(Identity e);
	 public List<Identity> getSubordinates();
}
