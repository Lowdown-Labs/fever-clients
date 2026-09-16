using System.IO;

namespace LowdownLabs.Fever.Client
{

    public class FileParameter
    {
        public string Name { get; set; } = "no_name_provided";

        public string ContentType { get; set; } = "application/octet-stream";

        public Stream Content { get; set; }

        public FileParameter(Stream content)
        {
            if (content is FileStream fs)
            {
                Name = fs.Name;
            }
            Content = content;
        }

        public FileParameter(string filename, Stream content)
        {
            Name = filename;
            Content = content;
        }

        public FileParameter(string filename, string contentType, Stream content)
        {
            Name = filename;
            ContentType = contentType;
            Content = content;
        }

        public static implicit operator FileParameter(Stream s) => new FileParameter(s);
    }
}
