package cc.mrbird.web.controller.pack;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.domain.QueryRequest;
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.pack.domain.Pack;
import cc.mrbird.pack.service.PackService;
import cc.mrbird.quartz.domain.Job;
import cc.mrbird.web.controller.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class packController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PackService packService;

    @Log("获取打包任务信息")
    @RequestMapping("pack")
    public String index() {
        return "pack/pack";
    }



    @RequestMapping("pack/find")
    @PreAuthorize("hasAuthority('pack:find')")
    @ResponseBody
    public ResponseBo findPack() {
        try {
            List<Pack> list = this.packService.findAllPacks();
            System.out.println(list.get(0).toString());
            return ResponseBo.ok("新增任务成功！");
        } catch (Exception e) {
            log.error("新增任务失败", e);
            return ResponseBo.error("新增任务失败，请联系网站管理员！");
        }
    }
    @RequestMapping("pack/list")
   // @PreAuthorize("hasAuthority('pack:list')")
    @ResponseBody
    public Map<String, Object> jobList(QueryRequest request, Job job) {
        List<Pack> list = this.packService.findAllPacks();
        System.out.println(list.get(0).toString());
        return super.selectByPageNumSize(request, () -> this.packService.findAllPacks());
    }

    //@PreAuthorize("hasAuthority('job:add')")
    @RequestMapping("pack/add")
    @ResponseBody
    public ResponseBo addJob(Pack pack) {
        try {
            //this.jobService.addJob(job);
            System.out.println(pack.toString());
            return ResponseBo.ok("新增任务成功！");
        } catch (Exception e) {
            log.error("新增任务失败", e);
            return ResponseBo.error("新增任务失败，请联系网站管理员！");
        }
    }

    //@PreAuthorize("hasAuthority('job:update')")
    @RequestMapping("pack/update")
    @ResponseBody
    public ResponseBo updateJob(Pack pack) {
        try {
            //this.jobService.updateJob(job);
            System.out.println(pack.toString());
            return ResponseBo.ok("修改任务成功！");
        } catch (Exception e) {
            log.error("修改任务失败", e);
            return ResponseBo.error("修改任务失败，请联系网站管理员！");
        }
    }
}
