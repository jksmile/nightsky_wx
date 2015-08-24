package com.xjk.project.service.imp;

import com.xjk.project.service.Performer;
import org.springframework.stereotype.Service;

/**
 * Intro:
 * Project: projectA
 * Date:    2/28/15
 * Author:  xujinkai
 */

@Service("jugglerService")
public class Juggler implements Performer {


	private int beanBags = 3;

	public Juggler(){

	}


	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}


	@Override
	public void perform() {
		System.out.println("Juggleing "+beanBags+" beanbags");
	}



}
