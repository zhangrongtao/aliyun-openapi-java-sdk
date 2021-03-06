/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateVnKnowledgeRequest extends RpcAcsRequest<CreateVnKnowledgeResponse> {
	
	public CreateVnKnowledgeRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateVnKnowledge", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String answer;

	private List<String> similarUtterancess;

	private String userUtterance;

	private Boolean interruptible;

	private String categoryId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
		if(answer != null){
			putQueryParameter("Answer", answer);
		}
	}

	public List<String> getSimilarUtterancess() {
		return this.similarUtterancess;
	}

	public void setSimilarUtterancess(List<String> similarUtterancess) {
		this.similarUtterancess = similarUtterancess;	
		if (similarUtterancess != null) {
			for (int i = 0; i < similarUtterancess.size(); i++) {
				putQueryParameter("SimilarUtterances." + (i + 1) , similarUtterancess.get(i));
			}
		}	
	}

	public String getUserUtterance() {
		return this.userUtterance;
	}

	public void setUserUtterance(String userUtterance) {
		this.userUtterance = userUtterance;
		if(userUtterance != null){
			putQueryParameter("UserUtterance", userUtterance);
		}
	}

	public Boolean getInterruptible() {
		return this.interruptible;
	}

	public void setInterruptible(Boolean interruptible) {
		this.interruptible = interruptible;
		if(interruptible != null){
			putQueryParameter("Interruptible", interruptible.toString());
		}
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId);
		}
	}

	@Override
	public Class<CreateVnKnowledgeResponse> getResponseClass() {
		return CreateVnKnowledgeResponse.class;
	}

}
