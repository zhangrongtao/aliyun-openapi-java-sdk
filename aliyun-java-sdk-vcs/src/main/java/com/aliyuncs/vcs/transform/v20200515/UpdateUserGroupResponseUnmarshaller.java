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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.UpdateUserGroupResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateUserGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserGroupResponseUnmarshaller {

	public static UpdateUserGroupResponse unmarshall(UpdateUserGroupResponse updateUserGroupResponse, UnmarshallerContext _ctx) {
		
		updateUserGroupResponse.setRequestId(_ctx.stringValue("UpdateUserGroupResponse.RequestId"));
		updateUserGroupResponse.setCode(_ctx.stringValue("UpdateUserGroupResponse.Code"));
		updateUserGroupResponse.setMessage(_ctx.stringValue("UpdateUserGroupResponse.Message"));

		Data data = new Data();
		data.setUserGroupId(_ctx.longValue("UpdateUserGroupResponse.Data.UserGroupId"));
		data.setIsvSubId(_ctx.stringValue("UpdateUserGroupResponse.Data.IsvSubId"));
		data.setUserGroupName(_ctx.stringValue("UpdateUserGroupResponse.Data.UserGroupName"));
		data.setUserCount(_ctx.longValue("UpdateUserGroupResponse.Data.UserCount"));
		data.setParentUserGroupId(_ctx.stringValue("UpdateUserGroupResponse.Data.ParentUserGroupId"));
		updateUserGroupResponse.setData(data);
	 
	 	return updateUserGroupResponse;
	}
}