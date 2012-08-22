/* Do not modify this file by hand.
 *
 * It is automatically generated by src/api_wrappers/generateJavaAPIWrappers.py.
 * (Run make api_wrappers to update it.)
 */

package com.dnanexus;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.dnanexus.DXHTTPRequest;

public class DXAPI {

    public JsonNode appAddCategories(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addCategories", inputParams);
    }

    public JsonNode appAddDevelopers(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addDevelopers", inputParams);
    }

    public JsonNode appAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode appDelete(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "delete", inputParams);
    }

    public JsonNode appDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode appGet(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "get", inputParams);
    }

    public JsonNode appInstall(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "install", inputParams);
    }

    public JsonNode appListCategories(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listCategories", inputParams);
    }

    public JsonNode appListDevelopers(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listDevelopers", inputParams);
    }

    public JsonNode appPublish(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "publish", inputParams);
    }

    public JsonNode appRemoveCategories(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeCategories", inputParams);
    }

    public JsonNode appRemoveDevelopers(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeDevelopers", inputParams);
    }

    public JsonNode appRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode appRun(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "run", inputParams);
    }

    public JsonNode appUninstall(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "uninstall", inputParams);
    }

    public JsonNode appUpdate(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "update", inputParams);
    }

    public JsonNode appNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/app/new", inputParams);
    }

    public JsonNode appletAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode appletAddTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTypes", inputParams);
    }

    public JsonNode appletClose(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "close", inputParams);
    }

    public JsonNode appletDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode appletGet(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "get", inputParams);
    }

    public JsonNode appletGetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "getDetails", inputParams);
    }

    public JsonNode appletListProjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listProjects", inputParams);
    }

    public JsonNode appletRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode appletRemoveTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTypes", inputParams);
    }

    public JsonNode appletRename(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "rename", inputParams);
    }

    public JsonNode appletRun(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "run", inputParams);
    }

    public JsonNode appletSetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setDetails", inputParams);
    }

    public JsonNode appletSetProperties(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setProperties", inputParams);
    }

    public JsonNode appletSetVisibility(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setVisibility", inputParams);
    }

    public JsonNode appletNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/applet/new", inputParams);
    }

    public JsonNode containerClone(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "clone", inputParams);
    }

    public JsonNode containerDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode containerDestroy(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "destroy", inputParams);
    }

    public JsonNode containerListFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listFolder", inputParams);
    }

    public JsonNode containerMove(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "move", inputParams);
    }

    public JsonNode containerNewFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "newFolder", inputParams);
    }

    public JsonNode containerRemoveFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeFolder", inputParams);
    }

    public JsonNode containerRemoveObjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeObjects", inputParams);
    }

    public JsonNode containerRenameFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "renameFolder", inputParams);
    }

    public JsonNode fileAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode fileAddTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTypes", inputParams);
    }

    public JsonNode fileClose(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "close", inputParams);
    }

    public JsonNode fileDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode fileDownload(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "download", inputParams);
    }

    public JsonNode fileGetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "getDetails", inputParams);
    }

    public JsonNode fileListProjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listProjects", inputParams);
    }

    public JsonNode fileRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode fileRemoveTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTypes", inputParams);
    }

    public JsonNode fileRename(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "rename", inputParams);
    }

    public JsonNode fileSetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setDetails", inputParams);
    }

    public JsonNode fileSetProperties(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setProperties", inputParams);
    }

    public JsonNode fileSetVisibility(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setVisibility", inputParams);
    }

    public JsonNode fileUpload(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "upload", inputParams);
    }

    public JsonNode fileNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/file/new", inputParams);
    }

    public JsonNode gtableAddRows(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addRows", inputParams);
    }

    public JsonNode gtableAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode gtableAddTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTypes", inputParams);
    }

    public JsonNode gtableClose(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "close", inputParams);
    }

    public JsonNode gtableDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode gtableExtend(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "extend", inputParams);
    }

    public JsonNode gtableGet(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "get", inputParams);
    }

    public JsonNode gtableGetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "getDetails", inputParams);
    }

    public JsonNode gtableListProjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listProjects", inputParams);
    }

    public JsonNode gtableNextPart(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "nextPart", inputParams);
    }

    public JsonNode gtableRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode gtableRemoveTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTypes", inputParams);
    }

    public JsonNode gtableRename(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "rename", inputParams);
    }

    public JsonNode gtableSetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setDetails", inputParams);
    }

    public JsonNode gtableSetProperties(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setProperties", inputParams);
    }

    public JsonNode gtableSetVisibility(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setVisibility", inputParams);
    }

    public JsonNode gtableNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/gtable/new", inputParams);
    }

    public JsonNode inviteAccept(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "accept", inputParams);
    }

    public JsonNode inviteApprove(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "approve", inputParams);
    }

    public JsonNode inviteDecline(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "decline", inputParams);
    }

    public JsonNode inviteDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode inviteDestroy(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "destroy", inputParams);
    }

    public JsonNode inviteReject(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "reject", inputParams);
    }

    public JsonNode jobDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode jobStreamLog(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "streamLog", inputParams);
    }

    public JsonNode jobTerminate(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "terminate", inputParams);
    }

    public JsonNode jobNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/job/new", inputParams);
    }

    public JsonNode notificationsGet(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/notifications/get", inputParams);
    }

    public JsonNode notificationsMarkRead(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/notifications/markRead", inputParams);
    }

    public JsonNode projectAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode projectClone(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "clone", inputParams);
    }

    public JsonNode projectDecreasePermissions(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "decreasePermissions", inputParams);
    }

    public JsonNode projectDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode projectDestroy(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "destroy", inputParams);
    }

    public JsonNode projectInvite(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "invite", inputParams);
    }

    public JsonNode projectJoin(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "join", inputParams);
    }

    public JsonNode projectLeave(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "leave", inputParams);
    }

    public JsonNode projectListFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listFolder", inputParams);
    }

    public JsonNode projectMove(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "move", inputParams);
    }

    public JsonNode projectNewFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "newFolder", inputParams);
    }

    public JsonNode projectRemoveFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeFolder", inputParams);
    }

    public JsonNode projectRemoveObjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeObjects", inputParams);
    }

    public JsonNode projectRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode projectRenameFolder(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "renameFolder", inputParams);
    }

    public JsonNode projectSetProperties(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setProperties", inputParams);
    }

    public JsonNode projectSubscribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "subscribe", inputParams);
    }

    public JsonNode projectUnsubscribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "unsubscribe", inputParams);
    }

    public JsonNode projectUpdate(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "update", inputParams);
    }

    public JsonNode projectNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/project/new", inputParams);
    }

    public JsonNode recordAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode recordAddTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTypes", inputParams);
    }

    public JsonNode recordClose(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "close", inputParams);
    }

    public JsonNode recordDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode recordGetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "getDetails", inputParams);
    }

    public JsonNode recordListProjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listProjects", inputParams);
    }

    public JsonNode recordRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode recordRemoveTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTypes", inputParams);
    }

    public JsonNode recordRename(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "rename", inputParams);
    }

    public JsonNode recordSetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setDetails", inputParams);
    }

    public JsonNode recordSetProperties(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setProperties", inputParams);
    }

    public JsonNode recordSetVisibility(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setVisibility", inputParams);
    }

    public JsonNode recordNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/record/new", inputParams);
    }

    public JsonNode requestApprove(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "approve", inputParams);
    }

    public JsonNode requestDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode requestDestroy(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "destroy", inputParams);
    }

    public JsonNode requestReject(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "reject", inputParams);
    }

    public JsonNode systemFindAffiliates(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findAffiliates", inputParams);
    }

    public JsonNode systemFindApps(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findApps", inputParams);
    }

    public JsonNode systemFindDataObjects(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findDataObjects", inputParams);
    }

    public JsonNode systemFindDiscitems(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findDiscitems", inputParams);
    }

    public JsonNode systemFindFeeditems(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findFeeditems", inputParams);
    }

    public JsonNode systemFindInvites(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findInvites", inputParams);
    }

    public JsonNode systemFindJobs(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findJobs", inputParams);
    }

    public JsonNode systemFindProjects(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findProjects", inputParams);
    }

    public JsonNode systemFindRequests(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findRequests", inputParams);
    }

    public JsonNode systemFindUsers(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/findUsers", inputParams);
    }

    public JsonNode systemGetLog(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/getLog", inputParams);
    }

    public JsonNode systemGetProjectTags(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/getProjectTags", inputParams);
    }

    public JsonNode systemGlobalSearch(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/globalSearch", inputParams);
    }

    public JsonNode systemShortenURL(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/system/shortenURL", inputParams);
    }

    public JsonNode tableAddColumns(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addColumns", inputParams);
    }

    public JsonNode tableAddIndices(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addIndices", inputParams);
    }

    public JsonNode tableAddRows(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addRows", inputParams);
    }

    public JsonNode tableAddTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTags", inputParams);
    }

    public JsonNode tableAddTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "addTypes", inputParams);
    }

    public JsonNode tableClose(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "close", inputParams);
    }

    public JsonNode tableDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode tableGet(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "get", inputParams);
    }

    public JsonNode tableGetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "getDetails", inputParams);
    }

    public JsonNode tableListProjects(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "listProjects", inputParams);
    }

    public JsonNode tableModifyColumn(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "modifyColumn", inputParams);
    }

    public JsonNode tableRemoveColumns(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeColumns", inputParams);
    }

    public JsonNode tableRemoveIndices(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeIndices", inputParams);
    }

    public JsonNode tableRemoveRows(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeRows", inputParams);
    }

    public JsonNode tableRemoveTags(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTags", inputParams);
    }

    public JsonNode tableRemoveTypes(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "removeTypes", inputParams);
    }

    public JsonNode tableRename(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "rename", inputParams);
    }

    public JsonNode tableSetDetails(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setDetails", inputParams);
    }

    public JsonNode tableSetProperties(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setProperties", inputParams);
    }

    public JsonNode tableSetVisibility(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "setVisibility", inputParams);
    }

    public JsonNode tableUpdate(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "update", inputParams);
    }

    public JsonNode tableNew(JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/table/new", inputParams);
    }

    public JsonNode userDescribe(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "describe", inputParams);
    }

    public JsonNode userUpdate(String objectId, JsonNode inputParams) throws Exception {
        return new DXHTTPRequest().request("/" + objectId + "/" + "update", inputParams);
    }
}

