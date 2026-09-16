require 'spec_helper'
require 'json'

describe 'CorpusApi' do
  before do
    @api_instance = FeverClient::CorpusApi.new
  end

  after do
  end

  describe 'test an instance of CorpusApi' do
    it 'should create an instance of CorpusApi' do
      expect(@api_instance).to be_instance_of(FeverClient::CorpusApi)
    end
  end

  describe 'corpus_stats test' do
    it 'should work' do
    end
  end

end
