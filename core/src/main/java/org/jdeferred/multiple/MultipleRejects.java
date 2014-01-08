/*
 * Copyright 2014 Tristan Burch
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jdeferred.multiple;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Contains a list of {@link org.jdeferred.multiple.OneReject}.
 * @author Tristan Burch
 *
 */
public class MultipleRejects implements Iterable<OneReject> {
	private final List<OneReject> rejects;

	public MultipleRejects(int size) {
		this.rejects = new CopyOnWriteArrayList<OneReject>(new OneReject[size]);
	}
	
	protected void set(int index, OneReject result) {
		rejects.set(index, result);
	}
	
	public OneReject get(int index) {
		return rejects.get(index);
	}

	public Iterator<OneReject> iterator() {
		return rejects.iterator();
	}
	
	public int size() {
		return rejects.size();
	}

	@Override
	public String toString() {
		return "MultipleRejects [rejects=" + rejects + "]";
	}
}
