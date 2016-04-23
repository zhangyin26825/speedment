package com.zhangyin.speedment.speedment;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import com.speedment.Speedment;
import com.speedment.internal.util.MetadataUtil;
import com.speedment.manager.Manager;
import com.zhangyin.speedment.speedment.db0.sakila.actor.Actor;
import com.zhangyin.speedment.speedment.generated.GeneratedSpeedmentApplication;

/**
 * A {@link
 * com.speedment.internal.core.runtime.SpeedmentApplicationLifecycle} class
 * for the {@link com.speedment.config.db.Project} named speedment.
 * representing an entity (for example, a row) in the Project speedment.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code
 * generator.
 * 
 * @author company
 */
public final class SpeedmentApplication extends GeneratedSpeedmentApplication {
    
	public static void main(String[] args) {
		Speedment speedment=new SpeedmentApplication().withPassword("123456").build();
		Manager<Actor> actors = speedment.managerOf(Actor.class);
		actors.newEmptyEntity()
			.setFirstName("张")
			.setLastName("银")
			.setLastUpdate(new Timestamp(System.currentTimeMillis()))
			.persist(MetadataUtil.toText(System.out::println));
		List<Actor> collect = actors.stream().filter(Actor.FIRST_NAME.equal("张")).collect(Collectors.toList());
		System.out.println(collect.size());
	}
    
}