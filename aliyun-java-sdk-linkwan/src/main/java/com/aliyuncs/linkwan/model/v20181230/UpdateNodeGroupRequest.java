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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateNodeGroupRequest extends RpcAcsRequest<UpdateNodeGroupResponse> {
	
	public UpdateNodeGroupRequest() {
		super("LinkWAN", "2018-12-30", "UpdateNodeGroup", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String nodeGroupName;

	private String nodeGroupId;

	public String getNodeGroupName() {
		return this.nodeGroupName;
	}

	public void setNodeGroupName(String nodeGroupName) {
		this.nodeGroupName = nodeGroupName;
		if(nodeGroupName != null){
			putBodyParameter("NodeGroupName", nodeGroupName);
		}
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putBodyParameter("NodeGroupId", nodeGroupId);
		}
	}

	@Override
	public Class<UpdateNodeGroupResponse> getResponseClass() {
		return UpdateNodeGroupResponse.class;
	}

}
