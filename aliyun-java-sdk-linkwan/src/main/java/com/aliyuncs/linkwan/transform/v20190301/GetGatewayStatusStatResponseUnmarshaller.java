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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.GetGatewayStatusStatResponse;
import com.aliyuncs.linkwan.model.v20190301.GetGatewayStatusStatResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayStatusStatResponseUnmarshaller {

	public static GetGatewayStatusStatResponse unmarshall(GetGatewayStatusStatResponse getGatewayStatusStatResponse, UnmarshallerContext _ctx) {
		
		getGatewayStatusStatResponse.setRequestId(_ctx.stringValue("GetGatewayStatusStatResponse.RequestId"));
		getGatewayStatusStatResponse.setSuccess(_ctx.booleanValue("GetGatewayStatusStatResponse.Success"));

		Data data = new Data();
		data.setGwEui(_ctx.stringValue("GetGatewayStatusStatResponse.Data.GwEui"));
		data.setCpuRadio(_ctx.floatValue("GetGatewayStatusStatResponse.Data.CpuRadio"));
		data.setMemoryRadio(_ctx.floatValue("GetGatewayStatusStatResponse.Data.MemoryRadio"));
		data.setRxCount(_ctx.longValue("GetGatewayStatusStatResponse.Data.RxCount"));
		data.setTxCount(_ctx.longValue("GetGatewayStatusStatResponse.Data.TxCount"));
		data.setOnlineState(_ctx.stringValue("GetGatewayStatusStatResponse.Data.OnlineState"));
		data.setOnlineHour(_ctx.longValue("GetGatewayStatusStatResponse.Data.OnlineHour"));
		data.setEnabled(_ctx.booleanValue("GetGatewayStatusStatResponse.Data.Enabled"));
		getGatewayStatusStatResponse.setData(data);
	 
	 	return getGatewayStatusStatResponse;
	}
}