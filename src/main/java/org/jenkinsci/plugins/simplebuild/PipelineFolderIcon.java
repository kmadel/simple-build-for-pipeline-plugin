package org.jenkinsci.plugins.simplebuild;

import com.cloudbees.hudson.plugins.folder.FolderIcon;
import com.cloudbees.hudson.plugins.folder.FolderIconDescriptor;
import hudson.Extension;
import hudson.model.Hudson;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.Stapler;

/**
 * {@link FolderIcon} for pipeline folder.
 *
 * @author Kurt Madel
 *
 */
public class PipelineFolderIcon extends FolderIcon {
    @DataBoundConstructor
    public PipelineFolderIcon() {
    }

    @Override
    public String getImageOf(String s) {
        return Stapler.getCurrentRequest().getContextPath()+ Hudson.RESOURCE_PATH+"/plugin/simple-build-for-pipeline/images/pipeline-folder/"+s+".png";
    }

    @Override
    public String getDescription() {
        return "Pipeline Folder";
    }

    @Extension
    public static class DescriptorImpl extends FolderIconDescriptor {
        @Override
        public String getDisplayName() {
            return "Pipeline Folder Icon";
        }
    }
}