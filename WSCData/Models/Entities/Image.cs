﻿namespace WSCData.Models.Entities
{
    public class Image
    {
        public int Id { get; set; }
        public byte[] Data { get; set; }
        public string Extension { get; set; }
    }
}